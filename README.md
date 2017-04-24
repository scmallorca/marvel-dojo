MArvel Dojo
=========================

## Instrucciones (spanish)
El objetivo de esta kata es desarrollar mediante TDD, un programa para listar los próximos comics que saldrán la semana que viene usando el API de marvel para recuperar dicha información.

Siendo importante:
1. __Conectarse a un servicio de terceros__
  * Haciendo uso de la Api de Marvel
  * Peticiones autenticadas.  
2. __Mostrar lista de comics__
  * Título
  * Imagen, miniatura
  * Precio

## Instructions (english)
The objective of this kata is to develop through TDD, a program to print the upcoming comics released the next week using the Marvel's API to get this information.

Take in consideration:
1. __Connecting with third-party service__
  * Using Marvel's API.
  * Authenticated requests.
2. __Print the upcoming comics__
  * Títle
  * Thumbmail
  * Price


## Solutions
Please, perform a pull request over this repository to add your team solution:
* Fork the repository to your github account.
* Clone the forked repository:
```
$ git clone https://github.com/your_username/marvel-dojo.git
```
* Access the repository
```
$ cd marvel-dojo
```
* Create a new branch and move to it:
```
$ git checkout -b team_name-branch
```
* Create a folder like "nameA-nameB" or just "nameA" if you are a solo developer in the root of this repository and add your solution:
```
$ mkdir team_name_java
$ cp -r ../MyKata ./team_name_java
```
* Add changes to git and commit
```
$ git add -A
$ git commit -m "Added team_name solution in java"
```
* Push your changes to your remote repository
```
$ git push --set-upstream origin team_name-branch
```
* Create a pull-request from your forked and updated repository on github:
* Select as "base fork" the "cmallorca/marvel-dojo" master branch
* Select as "head fork" your "your_name/marvel-dojo" team_name branch

## Extra challenges
* Use ReactiveExtensions to control timers with TestScheduler (available for any language)

## References 
* Original kata posted in github: [Marvel Kata](http://nikeyes.github.io/MarvelKata)
