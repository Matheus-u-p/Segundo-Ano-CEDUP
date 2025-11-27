<?php
$anteior = 0;
    for($i=0; $i <= 200; $i++){
        $soma = $i + $anteior;
        $anteior = $soma;
    }
    echo "Resultado da soma dos 200 primeiros números: $soma";
?>