//https://programmers.co.kr/learn/courses/30/lessons/42862
//체육복
function solution(n, lost, reserve) {
	let answer = 0;
	lost.sort();
	reserve.sort();

	let lostArr = lost.map((a) => {
		let obj = { lost: a, chk: true };
		return obj;
	});
	let resArr = reserve.map((a) => {
		let obj = { res: a, chk: true };
		return obj;
	});

	for (let i = 0; i < lost.length; i++) {
		for (let j = 0; j < reserve.length; j++) {
			if (lost[i] === reserve[j]) {
				resArr[j].chk = false;
				lostArr[i].chk = false;
			}
		}
	}

	for (let i = 0; i < lost.length; i++) {
		for (let j = 0; j < reserve.length; j++) {
			if (
				lost[i] - 1 === reserve[j] &&
				lostArr[i].chk === true &&
				resArr[j].chk === true
			) {
				lostArr[i].chk = false;
				resArr[j].chk = false;
				break;
			} else if (
				lost[i] + 1 === reserve[j] &&
				lostArr[i].chk === true &&
				resArr[j].chk === true
			) {
				lostArr[i].chk = false;
				resArr[j].chk = false;
				break;
			}
		}
	}

	for (let i = 0; i < lost.length; i++) {
		if (lostArr[i].chk === true) {
			n--;
		}
	}

	return n;
}
