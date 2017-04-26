<?php


namespace Api;

require_once "Api.php";

class MarvelApi extends Api  {

  function __construct() {

      $this->endpoint = "http://gateway.marvel.com/v1/public";
      $this->ts = time();
      $this->apiKey = "97f295907072a970c5df30d73d1f3816";
      $this->privateKey ="ed54a875c0dffad1fa6af84e66ff104434a1c6cc";
      $this->http = new \GuzzleHttp\Client();

  }

  function getComics($params=array()) {

    $params["ts"] = $this->ts;
    $params["apikey"] = $this->apiKey;
    $params["hash"] = md5($this->ts.$this->privateKey.$this->apiKey);
    $url = $this->endpoint."/comics?".http_build_query($params);

    try  {
      $res = $this->http->request('GET', $url);
      //print_r($res);

      return json_decode((string)$res->getBody(),true);

    }catch (Exception $e) {


    }
  }

}
