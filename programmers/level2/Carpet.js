//https://programmers.co.kr/learn/courses/30/lessons/42842
//카펫
function solution(brown, yellow) {
	let answer = [];
	let area = brown + yellow;
	for (let i = 1; i <= Math.ceil(area / 2); i++) {
		if (area % i == 0) {
			let big = area / i;
			let small = i;
			if ((big - 1) * 2 + (small - 1) * 2 === brown) {
				answer.push(big);
				answer.push(small);
				break;
			}
		}
	}
	return answer;
}
