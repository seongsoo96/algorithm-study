//https://programmers.co.kr/learn/courses/30/lessons/72410
//신규 아이디 추천
function solution(new_id) {
	const id = new_id
		.toLowerCase() // 1단계
		.replace(/[^\w\d-_.]/g, "") // 2단계
		.replace(/\.{2,}/g, ".") //3단계
		.replace(/^\.|\.$/g, "") //4단계
		.padEnd(1, "a") //5단계
		.slice(0, 15) //6단계
		.replace(/^\.|\.$/g, ""); //7단계
	return id.padEnd(3, id[id.length - 1]);
}
