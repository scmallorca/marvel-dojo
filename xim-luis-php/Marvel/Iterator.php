<?php

namespace Marvel\Iterator;

require_once "Marvel/Model.php";

class Iterator implements \Iterator {

   private $position = 0;
   private  $array = [];

   public function __construct($items) {
        $this->position = 0;

        foreach ($items as $item) {
          $this->array[] = new \Marvel\Model\Comic($item);
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
}


 class Comics extends Iterator {


 }
