var register = register || {}

register.register = (x) => {
	$.ajax({
		url: `${x}`,
		type: 'POST',
		data: JSON.stringify({
			userid: $(`#userid`).val(),
			password: $(`#password`).val(),
		}),
		dataType: 'json',
		contentType: 'application/json',
		success: d => {
			if (d.message === 'SUCCESS') {
				alert(`Test`)
			} else {
				alert('가입  실패, 다시 시도해 주세요')
			}
		},

		error: e => {
			alert(`Error`)
		}
	})
}
