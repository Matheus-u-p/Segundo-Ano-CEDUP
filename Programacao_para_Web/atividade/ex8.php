<?php
$n1= $_POST['n1']; 
$n2= $_POST['n2'];
$n3= $_POST['n3'];

if($n1 >= $n2 && $n1 >= $n3){
    echo "$n1 é a maior nota</br>";
}

else if($n2 >= $n1 && $n2 >= $n3){
    echo "$n2 é a maior nota</br>";
}

else if($n3 >= $n1 && $n3 >= $n2){
    echo "$n3 é a maior nota</br>";
}
$soma= $n1+$n2+$n3;
$media= $soma/3;
echo "A média das notas é $media";
?>