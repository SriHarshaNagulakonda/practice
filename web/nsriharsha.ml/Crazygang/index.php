<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Crazy Gang</title>
    <link rel="stylesheet" href="style.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/jquery.magnific-popup.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/magnific-popup.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>

    <div class="gallery-section">
      <div class="inner-width">
        <center><h2><font color="blue">Crazy Gang</font></h2></center>
        <div class="border"></div>
        <center><h2>good times and crazy friends make the <br><font color="red">best memories </font></h2><br>

<br>
<br>
          <h1>  
        <font color="red">f</font>ew&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<br>
        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<font color="red">r</font>elations<br>
        <font color="red">i</font>n&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<br>
        <font color="red">e</font>arth&nbsp&nbsp&nbsp<br>
        <font color="red">n</font>ever&nbsp&nbsp&nbsp<br>
        <font color="red">d</font>ie&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<br>
        
        </center></h1><br><br><br>

        <div class="gallery">

<?php 
  for($i=150;$i>=1;$i--){
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
