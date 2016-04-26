$(document).ready(function () {
    $('#allTopics').DataTable({
        "processing": true,
        "serverSide": true,
        "ajax": "/topics/json",
        "columns": [
            {"data": "id"},
            {"data": "name"}
        ]
    });
});
