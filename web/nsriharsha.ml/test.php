<?php
echo "hello world";
if(!($connection=mysqli_connect("localhost","id10205685_harsha","Sagarekha@123","id10205685_harsha")))
die("could not connect");
function showerror()
{
die("error:".mysqli_error().":".mysqli_error());
}
if(!(mysql_select_db($connection,"id10205685_harsha")))
showerror();
$result=mysqi_query($connection,"select * from test");
if($result)
echo mysqli_fetch_array($result)[0];
else
echo mysqli_error();
?>