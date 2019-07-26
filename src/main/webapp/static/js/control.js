$(function () {
    setTimeout(function () {
        fresh();
    },5000);
    setInterval(function () {
        fresh();
    },5000);
    function fresh() {
        window.location.reload();
    }
})