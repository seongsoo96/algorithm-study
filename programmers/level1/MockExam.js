//https://programmers.co.kr/learn/courses/30/lessons/42840
//모의고사
function solution(answers) {
	let answer = [];
	let oneCnt = 0;
	let twoCnt = 0;
	let thrCnt = 0;
	let one = [1, 2, 3, 4, 5];
	let two = [2, 1, 2, 3, 2, 4, 2, 5];
	let thr = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

	for (let i = 0; i < answers.length; i++) {
		let k = 0;
		if (i > one.length - 1) {
			k = Math.floor(i / 5);
		}
		if (answers[i] === one[i - 5 * k]) {
			oneCnt++;
		}
	}

	for (let i = 0; i < answers.length; i++) {
		let k = 0;
		if (i > two.length - 1) {
			k = Math.floor(i / 8);
		}
		if (answers[i] === two[i - 8 * k]) {
			twoCnt++;
		}
	}

	for (let i = 0; i < answers.length; i++) {
		let k = 0;
		if (i > thr.length - 1) {
			k = Math.floor(i / 10);
		}
		if (answers[i] === thr[i - 10 * k]) {
			thrCnt++;
		}
	}

	if (oneCnt === twoCnt) {
		if (twoCnt === thrCnt) {
			answer = [1, 2, 3];
		} else if (twoCnt > thrCnt) {
			answer = [1, 2];
		} else if (twoCnt < thrCnt) {
			answer = [3];
		}

		return answer;
	}

	if (twoCnt === thrCnt) {
		if (thrCnt === oneCnt) {
			answer = [1, 2, 3];
		} else if (thrCnt > oneCnt) {
			answer = [2, 3];
		} else if (thrCnt < oneCnt) {
			answer = [1];
		}

		return answer;
	}

	if (thrCnt === oneCnt) {
		if (oneCnt === twoCnt) {
			answer = [1, 2, 3];
		} else if (oneCnt > twoCnt) {
			answer = [1, 3];
		} else if (oneCnt < twoCnt) {
			answer = [2];
		}

		return answer;
	}

	if (oneCnt > twoCnt) {
		if (oneCnt > thrCnt) {
			answer = [1];
		} else {
			answer = [3];
		}

		return answer;
	}

	if (twoCnt > thrCnt) {
		if (twoCnt > oneCnt) {
			answer = [2];
		} else {
			answer = [1];
		}

		return answer;
	}

	if (thrCnt > oneCnt) {
		if (thrCnt > twoCnt) {
			answer = [3];
		} else {
			answer = [2];
		}

		return answer;
	}
}
