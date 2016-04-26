$(document).ready(function () {
    $('#allTopics').DataTable({
        "processing": true,
        "serverSide": true,
        "bPaginate": false,
        "bFilter": false,
        "bInfo": false,
        "bSort": false,
        "ajax": "/topics/json",
        "columns": [
            {"data": "name"}
        ]
    });
});
