//https://programmers.co.kr/learn/courses/30/lessons/42586
//기능개발
function solution(pro, speeds) {
	let answer = [];
	let day = [];
	for (let i = 0; i < pro.length; i++) {
		day.push(Math.ceil((100 - pro[i]) / speeds[i]));
	}
	while (day.length > 0) {
		let cnt = 1;
		for (let i = 1; i <= day.length; i++) {
			if (day[0] >= day[i]) {
				cnt++;
				continue;
			}
			answer.push(cnt);
			day.splice(0, cnt);
			break;
		}
	}
	return answer;
}
