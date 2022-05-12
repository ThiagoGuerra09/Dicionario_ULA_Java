# Dicionario_ULA_Java
Pega instruções de um arquivo e transforma em algo que pode ser lido por uma ULA

O software no PC poderá ser escrito em C, C++, C# , Java ou Python. 
Você deverá criar um programa que transforme um texto lido de um arquivo nas instruções a serem executadas e 
permita a sua execução linha a linha através do console.  Para isso, o programa deverá inicialmente ler um arquivo 
contendo  um  texto  original  com  os  mnemônicos  (instruções  a  serem  executadas)  e  gerar  um  segundo  texto,  onde  
cada  linha  seja  transformada  nos  valores  que  serão  disponibilizados  para  a  porta  USB/serial  (ou  digitados)  no  
Arduino.  Esse  segundo  texto  deverá  ser  um  arquivo  gravado  com  os  respectivos  valores  a  serem  enviados  para  a  
porta USB/serial (ou digitados) porém no formato hexadecimal. 

<b>O que você recebe:</b> <br>
 <br>
inicio: <br> 
X=C;  <br>
Y=6;  <br>
W=AB;  <br>
X=A;  <br>
Y=3;  <br>
W=AoB;  <br>
W=nAeB;  <br>
X=D;  <br>
W=Bn;  <br>
fim.  <br>
 
 
 <b>O que entregar: </b><br>
 
 C6B <br>
  A3E <br>
  A34 <br>
  D35 <br>
  
  Para isso, o código consulta um dicionário de Instruções e Mnemônicos apresentados abaixo para saber o que irá retornar. 
  
  ![image](https://user-images.githubusercontent.com/82849005/168155389-9833ca21-8233-466a-b118-5ec3e46ebabc.png)

