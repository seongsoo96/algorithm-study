//https://programmers.co.kr/learn/courses/30/lessons/92334
//신고 결과 받기
function solution(id_list, report, k) {
	let answer = [];
	for (let i = 0; i < id_list.length; i++) {
		answer.push(0);
	}
	let mailCnt = id_list.map((a) => (a = { name: a, cnt: 0 }));
	let reportSet = [...new Set(report)];
	let reportArr = reportSet.map((a) => a.split(" "));
	let reported = reportArr.map((a) => a[1]);
	let id_list_cnt = id_list.map((a) => (a = { name: a, cnt: 0 }));

	for (let a of id_list_cnt) {
		for (let b of reported) {
			if (a.name === b) {
				a.cnt++;
				continue;
			}
		}
	}

	let banned = [];
	for (let a of id_list_cnt) {
		if (a.cnt >= k) {
			banned.push(a.name);
			continue;
		}
	}

	let getMail = [];
	if (banned.length === 0) {
		return answer;
	} else {
		for (let i = 0; i < reportArr.length; i++) {
			for (let j = 0; j < banned.length; j++) {
				if (reportArr[i][1] === banned[j]) {
					getMail.push(reportArr[i][0]);
					continue;
				}
			}
		}
	}

	for (let i = 0; i < getMail.length; i++) {
		for (let j = 0; j < mailCnt.length; j++) {
			if (getMail[i] === mailCnt[j].name) {
				mailCnt[j].cnt++;
				continue;
			}
		}
	}

	answer = mailCnt.map((a) => a.cnt);

	return answer;
}
