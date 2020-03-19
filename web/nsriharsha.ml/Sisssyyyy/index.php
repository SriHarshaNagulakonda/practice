<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>SRI HARSHA | VYUHA</title>
    <link rel="stylesheet" href="style.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/jquery.magnific-popup.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/magnific-popup.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>

    <div class="gallery-section">
      <div class="inner-width">
        <center><h2>My Gallery</h2></center>
        <div class="border"></div>



          <h1> 
          <font color="red">S</font>weet<br>
          &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<font color="red">i</font>nnocent<br>
          <font color="red">s</font>mart<br>
          &nbsp&nbsp&nbsp&nbsp&nbsp<font color="red">t</font>alented<br>
          &nbsp&nbsp&nbsp<font color="red">e</font>legant<br>
          &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<font color="red">r</font>emarkable<br>
          </h1>
          <br>
          <br>
          <h1>There is no better friend than a <font color="red">sister</font> and there is no <font color="red">better sister</font> than you.</h1>
<!--          
          <font color="red">I</font><br>
        &nbsp&nbsp&nbsp&nbspam <font color="red">L</font>ucky<br>
           t<font color="red">O</font>&nbsp&nbsp<br>
          ha<font color="red">V</font>e&nbsp&nbsp<br>
       a fri<font color="red">E</font>nd&nbsp&nbsp&nbsp<br>
like <font color="red">U</font>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<br></center>
-->
</h1><br>

        <div class="gallery">

<?php 
  for($i=36;$i>=1;$i--){
    echo "<a href='".$i.".jpeg' class='image'>
            <img src='".$i.".jpeg' alt='".$i."' >
          </a>&nbsp&nbsp&nbsp&nbsp";
        }
?>
        </div>
      </div>
    </div>


  <script>
    $(".gallery").magnificPopup({
      delegate: 'a',
      type: 'image',
      gallery:{
        enabled: true
      }
    });
  </script>

  </body>
</html>
