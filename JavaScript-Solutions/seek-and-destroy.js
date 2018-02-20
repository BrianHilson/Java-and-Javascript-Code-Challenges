/* From FreeCodeCamp: https://www.freecodecamp.org/challenges/seek-and-destroy 

"You will be provided with an initial array
(the first argument in the destroyer function), 
followed by one or more arguments. Remove all 
elements from the initial array that are of 
the same value as these arguments."

*/

function destroyer(arr) {
  var target = arguments[0];
  var args = Array.prototype.slice.call(arguments);
  var newArr = [];
  for (var i = 0; i < target.length; i++) {
    var destroy = false;
    for (var j = 0; j < args.length; j++) {
        if (target[i] === args[j]) {
          destroy = true;
        }
    }
    if (destroy === true) {
    } else {
      newArr.push(target[i]);
    }
  }
  return newArr;
}
