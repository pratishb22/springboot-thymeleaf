console.log("static root js run");

$(document).on('click', '#populateUsersId', function () {
    console.log("Populating users...");
    populateUsers();

});

var populateUsers = function () {
    var users = $.ajax({
        url: "/list/users",
        method: "GET"
    });
    users.done(function (data) {
        if (data) {
            console.log("Users fetched successfully");
            data.forEach(function (user) {
                $('#userUlId').append("<li>" + user.name + "</li>");
            });
        }
    });
    users.fail(function (jqXHR, textStatus) {
        console.log("Error in fetching users");
    })
};
