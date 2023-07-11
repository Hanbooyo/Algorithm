function solution(x) {
  let sum = 0;
  let num = x;

  while (num != 0) {
    sum += num % 10;
    num = Math.floor(num / 10);
  }

  if (x % sum === 0) {
    return true;
  } else {
    return false;
  }
}
