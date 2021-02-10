var lst = lst || {}

lst.lst = (x) => {
	$.getJSON(`${x}/select`, function(a) {
		$.each(a, function(index, item) {
			$('<ul/>')
				.attr({ id: 'ul' })
				.appendTo('#list')

			$.each(d.list, (i, j) => {
				$(`<li>
				<a id="${j.pceNum}">
					<div class="img"><img src="${j.placeImg}"/></div>
					<div class="txt"><strong>${j.name}</strong></div>
				</a>
			</li>`)
					.appendTo('#ul')
			})
			$('#main #list ul li a').each(function(){
				$(this).click(e => {
					localStorage.setItem('pceNum', this.id)
					location.href = `/gwland/pce/detailPlace`
				})
			})
		})
	})
}