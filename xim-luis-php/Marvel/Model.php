<?php

namespace Marvel\Model;

require_once "Model.php";
require_once "Comic.php";


class Comic extends \Model\Comic  {


    function __construct($item) {
      $this->set($item);
    }

    public function  set($item) {

        $this->title      = $item["title"];
        $this->thumb_url  = $item["thumbnail"]["path"].$item["thumbnail"]["extension"];
        $this->price      = $item["prices"];

    }


}
