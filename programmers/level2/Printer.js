//https://programmers.co.kr/learn/courses/30/lessons/42587
//프린터
function solution(pri, loc) {
	let prIndex = pri.map((a, index) => [a, index + 1]);
	let prCopy = prIndex.slice();
	let obj = [];
	while (prIndex.length > 0) {
		for (let i = 0; i < prIndex.length; i++) {
			if (prIndex[0][0] < prIndex[i][0]) {
				let first = prIndex.shift();
				prIndex.push(first);
				i = 0;
			}
		}
		obj.push(prIndex.shift());
	}
	for (let i = 0; i < obj.length; i++) {
		if (prCopy[loc] === obj[i]) {
			return i + 1;
		}
	}
}
