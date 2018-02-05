function palindrome(str) {
  var toRemove = /[.,_:*+?^${}#@%$&()|[\]\\\-]|\s/g;
  var cleanedStr = str.toLowerCase().replace(toRemove, "");
  var reversedStr = cleanedStr.split('').reverse().join('');
  return reversedStr === cleanedStr;
}
