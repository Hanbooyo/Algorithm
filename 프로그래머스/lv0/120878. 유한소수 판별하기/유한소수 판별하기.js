function solution(a, b) {
  let answer = 0;
  let gcd = getGCD(a, b);
  a /= gcd;
  b /= gcd;

  if (isFiniteFraction(b)) {
    answer = 1;
  } else {
    answer = 2;
  }

  return answer;
}

function getGCD(a, b) {
  if (b === 0) {
    return a;
  }
  return getGCD(b, a % b);
}

function isFiniteFraction(num) {
  while (num % 2 === 0) {
    num /= 2;
  }
  while (num % 5 === 0) {
    num /= 5;
  }
  return num === 1;
}
