<?php


function get_cache($hash) {

    if(!file_exists("cache/".$hash.".json")) return false;

    $result = unserialize(file_get_contents("cache/".$hash.".json"));

    return (empty($result))?false:$result;
}

function set_cache($hash,$content) {

    file_put_contents("cache/".$hash.".json",serialize($content));
}
