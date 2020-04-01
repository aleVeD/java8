print("desde archivo")

function calcular(n1, n2) {
    return n1 + n2
}

var hilo = {
    run: function(){
        for (var i = 0; i < 20 ; i++) {
            print("imprimiendo "+i);
        }
    }
}