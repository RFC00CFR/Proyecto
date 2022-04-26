/* global productId, contextPath */

$(document).ready(function () {

    $(".btn-primary").on("click", function (evt) {
        addToCart();
    });
});
function addToCart() {
    cantidad = $("#cantidad" + productId).val();
    url = contextPath + "cart/add/" + productId + "/" + cantidad;
    $.ajax({
        type: "POST",
        url: url
    }).done(function () {
        showModalDialog("Shopping Cart", "Succesfully added item(s) to he shopping cart");
    }).fail(function () {
         showModalDialog("Shopping Cart", "Error adding item(s) to the shopping cart");
    });
}




