<?php
    
    $horas = $_POST['v2'];
    $nivel = $_POST['nivel'];

    
    if ($nivel == "nivel1") {
        $salario = 12 * $horas;
        echo "Professor nível 1, trabalhando $horas horas: $salario reais por dia";
    } 
    else if ($nivel == "nivel2") {
        $salario = 17 * $horas;
        echo "<br>Professor nível 2, trabalhando $horas horas: $salario reais por dia";
    } 
    else if ($nivel == "nivel3") {
        $salario = 22 * $horas;
        echo "<br>Professor nível 3, trabalhando $horas horas: $salario reais por dia";
    } 
    else {
        echo "Nível de professor inválido.";
    }
?>