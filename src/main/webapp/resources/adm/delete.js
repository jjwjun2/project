var regi = regi || {}

regi.regi = x => {

	$.ajax({
		url: `${x}/managers`,
		type: 'DELETE',
		data: JSON.stringify({

			userid: document.getElementById('userid').value,
			password: document.getElementById('password').value,
			number: 1,
			
		}),
		dataType: 'json',
		contentType: 'application/json',
		success: d => {
			if (d.message === "SUCCESS") {
				alert(`Register`)
			} else {
				alert(`Failure`)
			}
		},
		error: e => {
			alert(`Error`)
		}
	})
}