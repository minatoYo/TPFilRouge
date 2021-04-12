#!/bin/sh


echo "veuillez entrer la valeur du premier coté  " 

read a

echo "Veuillez saisir la valeur du deuxième coté "

read b

echo "Veuillez saisir la valeur du troisième coté "

read c

nbre=0


if  [ $a -gt $nbre ] && [ $b -gt $nbre ] && [ $c -gt $nbre ]
 then 
	
	
	if [ $a -ne $b ] && [ $a -ne $c ]&& [ $b -ne $c ]
	then 
		echo "Le triangle est scalène"
	elif [ $a -eq $b ] && [  $a != $c ] || [ $b != $c ] || [ $a == $c ] &&[ $a != $b ] || [ $b != $c ] || [ $b == $c ] &&[ $a != $b ]|| [ $b != $c ]
		then
		   echo "Le triangle est isocèle"
	elif [ $a -eq $b ] && [ $a -eq $c ]
	then 
		echo "Le triangle est équilatéral"	
 fi
 
 else 
 
	echo "Vous avez rentré un nombre négatif" 
	
fi
 
 
