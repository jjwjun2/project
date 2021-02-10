var regi = regi || {}

regi.regi = x => {

	$.ajax({
		url: `${x}/managers`,
		type: 'DELETE',
		data: JSON.stringify({

			userid: document.getElementById('userid').value,

			
		}),
		dataType: 'json',
		contentType: 'application/json',
		success: d => {
			if (d.message === "SUCCESS") {
				alert(`Delete`)
			} else {
				alert(`Failure`)
			}
		},
		error: e => {
			alert(`Error`)
		}
	})
}