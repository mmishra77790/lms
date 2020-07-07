$(document).ready( function () {
	 var table = $('#studentsTable').DataTable({
			"sAjaxSource": "/api/students",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"columns": [{
		        "title": "id",
		        "data": "id"
		    }, {
		        "title": "name",
		        "data": "name"
		    }, {
		        "title": "lastName",
		        "data": "lastName"
		    }, {
		        "title": "email",
		        "data": "email"
		    }, {
		        "title": "phone",
		        "data": "phone"
		    }, {
		        "title": "active",
		        "data": "active"
		    }],
			"aoColumns": [
			      { "mData": "id"},
		          { "mData": "name" },
				  { "mData": "lastName" },
				  { "mData": "email" },
				  { "mData": "phone" },
				  { "mData": "active" }
			],
			"aLengthMenu": [[5, 10, 15, -1], [5, 10, 15, "All"]],
		    "iDisplayLength": 5,
			"scrollX":        '150vh',
			"scrollY":        '150vh',
		    "scrollCollapse": true,
			"autoWidth": true,  
			"columnDefs": [
		        { "width": "150px", "targets": [0,1] },       
		        { "width": "40px", "targets": [4] }
		      ],
			'processing': true,
		    'language': {
		        'loadingRecords': '&nbsp;',
		        'processing': 'Loading...'
		    },   
			'dom': 'Rlfrtip',
			colReorder: true,
			responsive: {
		        details: {
		            type:'column',
		            display: $.fn.dataTable.Responsive.display.modal( {
		                header: function ( row ) {
		                    var data = row.data();
		                    return 'Details:';
		                }
		            } ),
		            renderer: function ( api, rowIdx, columns ) {
		                var data = $.map( columns, function ( col, i ) {
		                    return '<tr>'+
		                            '<td>'+col.title+':'+'</td> '+
		                            '<td>'+col.data+'</td>'+
		                        '</tr>';
		                } ).join('');

		                return $('<table width="100%"/>').append( data );
		            }
		        }
		    },
			dom: 'Blfrtip',
				colReorder: true,
		        buttons: [
					'colvis',
		            'copyHtml5',
		            'excelHtml5',
		            'csvHtml5',
		            'pdfHtml5'
		   ],
		   orderCellsTop: true,
		   fixedHeader: true,
	 })
	 
	 
	 var tableCourse = $('#coursesTable').DataTable({
			"sAjaxSource": "/api/students",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"columns": [{
		        "title": "id",
		        "data": "id"
		    }, {
		        "title": "name",
		        "data": "name"
		    }, {
		        "title": "lastName",
		        "data": "lastName"
		    }, {
		        "title": "email",
		        "data": "email"
		    }, {
		        "title": "phone",
		        "data": "phone"
		    }, {
		        "title": "active",
		        "data": "active"
		    }],
			"aoColumns": [
			      { "mData": "id"},
		          { "mData": "name" },
				  { "mData": "lastName" },
				  { "mData": "email" },
				  { "mData": "phone" },
				  { "mData": "active" }
			],
			"aLengthMenu": [[5, 10, 15, -1], [5, 10, 15, "All"]],
		    "iDisplayLength": 5,
			"scrollX":        '150vh',
			"scrollY":        '150vh',
		    "scrollCollapse": true,
			"autoWidth": true,  
			"columnDefs": [
		        { "width": "150px", "targets": [0,1] },       
		        { "width": "40px", "targets": [4] }
		      ],
			'processing': true,
		    'language': {
		        'loadingRecords': '&nbsp;',
		        'processing': 'Loading...'
		    },   
			'dom': 'Rlfrtip',
			colReorder: true,
			responsive: {
		        details: {
		            type:'column',
		            display: $.fn.dataTable.Responsive.display.modal( {
		                header: function ( row ) {
		                    var data = row.data();
		                    return 'Details:';
		                }
		            } ),
		            renderer: function ( api, rowIdx, columns ) {
		                var data = $.map( columns, function ( col, i ) {
		                    return '<tr>'+
		                            '<td>'+col.title+':'+'</td> '+
		                            '<td>'+col.data+'</td>'+
		                        '</tr>';
		                } ).join('');

		                return $('<table width="100%"/>').append( data );
		            }
		        }
		    },
			dom: 'Blfrtip',
				colReorder: true,
		        buttons: [
					'colvis',
		            'copyHtml5',
		            'excelHtml5',
		            'csvHtml5',
		            'pdfHtml5'
		   ],
		   orderCellsTop: true,
		   fixedHeader: true,
	 })
});