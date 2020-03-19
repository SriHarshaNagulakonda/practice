<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>PAVANI | RISHITHA</title>
    <link rel="stylesheet" href="style.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/jquery.magnific-popup.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/magnific-popup.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>

    <div class="gallery-section">
      <div class="inner-width">
        <font color="blue"><center><h2>Dedicated to my 2 kothi's</h2></center></font>
        <br>
        <div class="border"></div>
        <center><h2><font color="red">best friends<br></font> make good times better and hard times easier.</h2><br>
<br>
        <h1>  
        <font color="red">f</font>ight for u<br>
        <font color="red">r</font>espect u&nbsp&nbsp<br>
        <font color="red">i</font>nclude u&nbsp&nbsp&nbsp<br>
        &nbsp&nbsp&nbsp<font color="red">e</font>ncourage u<br>
        <font color="red">n</font>eed u&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<br>
        <font color="red">d</font>eserve u&nbsp&nbsp<br>
        &nbsp&nbsp&nbsp<font color="red">s</font>tand by u u<br><br><br>
        
        </center></h1><br>
        <div class="gallery">

<?php 
  for($i=44;$i>=0;$i--){
    echo "<a href='".$i.".jpeg' class='image'>
            <img src='".$i.".jpeg' alt='".$i."' >
          </a>";
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
