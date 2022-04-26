$(document).ready(
        function () {

            $(".linkMinus").on("click", function (evt) {
                evt.preventDefault();
                id = $(this).attr("id");
                qtyIN = $("#cantidad" + id);
                qtyNew = parseInt(qtyIN.val()) - 1;
                if (qtyNew > 0) {
                    qtyIN.val(qtyNew);
                } else {
                    showModalDialog("Error", "Minimum quantity is 1");
                }
            });

            $(".linkPlus").on("click", function (evt) {
                evt.preventDefault();
                id = $(this).attr("id");
                value = $(this).attr("value");
                valor = parseInt(value);
                qtyIN = $("#cantidad" + id);
                qtyNew = parseInt(qtyIN.val()) + 1;
                if (qtyNew <= valor) {
                    qtyIN.val(qtyNew);
                } else {
                    showModalDialog("Error", ("Maximum quantity is " + (valor).toString()));
                }
            });
        }
);
