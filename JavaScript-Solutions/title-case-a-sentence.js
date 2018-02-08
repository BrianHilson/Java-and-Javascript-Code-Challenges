
function titleCase(str) {
  var strArray = str.split(" ");
  for (var i = 0; i < strArray.length; i++) {
    strArray[i] = strArray[i].charAt(0).toUpperCase() +                                            
      strArray[i].slice(1).toLowerCase();
  }
  str = strArray.join(" ");
  return str;
}
