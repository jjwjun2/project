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
				alert(`SUCCESS`)
			} else {
				alert(`FAILURE`)
			}
		},
		error: e => {
			alert(`Error`)
		}
	})
}