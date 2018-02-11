function confirmEnding(str, target) {
  var ending = str.substr(-target.length);
  return ending === target;
}
