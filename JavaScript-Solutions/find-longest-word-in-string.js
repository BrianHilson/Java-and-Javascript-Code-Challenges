
function findLongestWord(str) {
  var stringArray = str.split(" ");
  var greatestNum = 0;
  for (var i = 0; i < stringArray.length; i++) {
    if (stringArray[i].length > greatestNum) {
      greatestNum = stringArray[i].length;
    }
  }
  return greatestNum;
}
