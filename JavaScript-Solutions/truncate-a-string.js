function truncateString(str, num) {
  if ((str.length - num) <= 0) {
    return str;
  } else if (num < 4) {
    return str.slice(0, num) + "...";
  } else {
    return str.slice(0, num-3) + "...";
  }
}
