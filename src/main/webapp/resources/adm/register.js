var regi = regi || {}

regi.regi = x => {

	$.ajax({
		url: `${x}/managers`,
		type: 'POST',
		data: JSON.stringify({

			userid: document.getElementById('userid').value,
			password: document.getElementById('password').value,
			number: 1,
			prdName: "A"
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