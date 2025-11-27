<?php 
$massai= $_POST['massai'];
$massa=$massai;
$tempo=0;
while ($massa >= 0.5){
    $massa= $massa/2;
    $tempo= $tempo+50;
}
$minuto = 0;
$hora = 0;
while($tempo > 60){
    $minuto ++;
    $tempo = $tempo - 60;
    if($minuto >60){
        $hora ++;
    }

}

echo "Massa inicial= $massai</br>";
echo "Massa final= $massa</br>";
echo "Tempo: $hora:$minuto:$tempo </br>";
?>