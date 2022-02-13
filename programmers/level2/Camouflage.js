//programmers.co.kr/learn/courses/30/lessons/42578
//위장
https: function solution(clothes) {
	let answer = 1;
	let obj = {};

	//의상의 종류만 가져오기(중복제거)
	let keyMap = clothes.map((a) => a[1]);
	console.log(keyMap); // 	[ 'headgear', 'eyewear', 'headgear' ]
	let keySet = new Set(keyMap); // Set으로 중복제거
	console.log(keySet); // Set { 'headgear', 'eyewear' }
	let key = [...keySet]; // Set -> Array (Spread Operator 전개연산자 사용)
	console.log(key); // [ 'headgear', 'eyewear' ]

	for (let i = 0; i < key.length; i++) {
		obj[key[i]] = 1; // 안 입는 조합까지 미리 케이스에 추가.
	}
	console.log(obj); // { headgear: 1, eyewear: 1 }

	for (let i = 0; i < key.length; i++) {
		for (let j = 0; j < clothes.length; j++) {
			if (key[i] === clothes[j][1]) {
				// 의상의 종류별로 몇개씩 있는지 파악
				obj[key[i]]++;
			}
		}
	}

	for (let o in obj) {
		// 문제의 핵심. 경우의 수를 이용하여 곱한다.
		answer *= obj[o];
	}

	return answer - 1; // 모든 경우의 수 중에 전부 다 안 입는 경우 1을 뺀다.
}
