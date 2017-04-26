<?php

namespace Model;

class Comic extends \Model  {
  protected $title;
  protected $thumb_url;
  protected $price;

  function __construct($item) {

  }

  public function getTitle() {
    return $this->title;
  }

  public function getThumbUrl() {
    return $this->thumb_url;
  }

  public function getPrices() {
    return $this->price;
  }
}
