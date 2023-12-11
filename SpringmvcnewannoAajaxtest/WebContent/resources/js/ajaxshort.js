
$(document).ready(function() {
    // check name availability on focus lost
    $('#name').blur(function() {
        checkAvailability();
    });
});

function checkAvailability() {
    $.getJSON("account/availability", { name: $('#name').val() }, function(availability) {
    	console.log(availability);
    	alert(availability);
        /*if (availability.present) {
            fieldValidated("name", { valid : true });
        } else {
            fieldValidated("name", { valid : false,
                message : $('#name').val() + " is not available, try " + availability.suggestions });
        }*/
    });
}