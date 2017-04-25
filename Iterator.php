<?php

namespace Iterator;

require_once "Model.php";
require_once "Comic.php";

class Iterator implements \Iterator {

   private $position = 0;
   private  $array = [];

   public function __construct($items) {
        $this->position = 0;

        foreach ($items as $item) {
          $this->array[] = new \Model\Comic($item);
        }

   }

    public function rewind() {
       $this->position = 0;
   }

   public function current() {
       return $this->array[$this->position];
   }

   public function key() {
       return $this->position;
   }

   public function next() {
       ++$this->position;
   }

   public function valid() {
       return isset($this->array[$this->position]);
   }

   public function append($items) {
        $this->array = array_merge($this->array,$items);
   }

}


 class Comics extends Iterator {


 }
