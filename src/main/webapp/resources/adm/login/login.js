var login = login || {}

login.login = x => {
	$.ajax({
		url: `${x}/managers/login`,
		type: 'POST',
		data: JSON.stringify({
			userid: $(`#userid`).val(),
			password: $(`#password`).val()
		}),
		dataType: 'json',
		contentType: 'application/json',
		success: d => {
			if (d.message === 'SUCCESS') {
				sessionStorage.setItem('userid', d.sessionUser.userid)
				location.href='views/home'
			} else {
				alert('로그인 실패, 다시 시도해 주세요')
				location.href = '/move/uss/login'
			}
		},

		error: e => {
			alert(`Error`)
		}
	})
}