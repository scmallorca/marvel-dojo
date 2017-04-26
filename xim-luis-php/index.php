<?php

include_once "functions.php";
include_once "Marvel/Api.php";
include_once "Marvel/Iterator.php";


$hash = "comics-".md5(serialize($params));

$results = get_cache($hash);
if($results == false) {

  $api = new Api\MarvelApi();
  $params["dateDescriptor"] = "nextWeek";
  $results = $api->getComics($params);
  set_cache($hash,$results);

}

$comics = new Marvel\Iterator\Comics($results["data"]["results"]);


echo "<pre>";
//print_r($results);
foreach ($comics as $comic) {
  # code...
  $price = reset($comic->getPrices());
  //print_r($comic);
  printf("%s a un precio de %s ",$comic->getTitle(),$price["price"]);
  //print_r($comic);
}


echo "</pre>";
