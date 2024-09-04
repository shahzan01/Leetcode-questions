class Solution {
    
    static int lowerboung(int a, List<Integer> li) {
        int low = 0;
        int high = li.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (li.get(mid) <= a) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }

        }
        return ans;
    }

    static int highboung(int a, List<Integer> li) {
      
        int low = 0;
        int high = li.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (li.get(mid) >= a) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }

        }
        return ans;
    }

    public int robotSim(int[] commands, int[][] obstacles) {
        int max=0;
       HashMap<Integer, List<Integer>> xObs = new HashMap<>();
        HashMap<Integer, List<Integer>> yObs = new HashMap<>();
        int curx = 0;
        int cury = 0;
        int curdir = 0;
        for (int i = 0; i < obstacles.length; i++) {
            int x = obstacles[i][0];
            int y = obstacles[i][1];
           
            xObs.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
            yObs.computeIfAbsent(y, k -> new ArrayList<>()).add(x);
        }

        for (List<Integer> is : xObs.values()) {
            Collections.sort(is);
        }
        for (List<Integer> is : yObs.values()) {
            Collections.sort(is);
        }

        for (int i = 0; i < commands.length; i++) {
            int cur = commands[i];
            if (cur == -1) {
                curdir++;
                curdir %= 4;
            } else if (cur == -2) {
                curdir--;
                curdir = (curdir + 4) % 4;
            } else {
                if (curdir == 0 || curdir == 2) {// changes in y-direction ,x constant
                    if (xObs.containsKey(curx)) {
                        if (curdir == 0) {
                            int n = lowerboung(cury, xObs.get(curx));
                            if (n == -1) {
                                cury += cur;
                            } else {
                                int tem = xObs.get(curx).get(n);
                                if (tem > cury + cur) {
                                    cury += cur;
                                } else {
                                    cury = tem - 1;
                                }
                            }
                        } else {
                            int n = highboung(cury, xObs.get(curx));
                            if (n == -1) {
                                cury -= cur;
                            } else {
                                int tem = xObs.get(curx).get(n);
                                if (tem < cury - cur) {
                                    cury -= cur;
                                } else {
                                    cury = tem + 1;
                                }
                            }

                        }

                    } else {
                        if (curdir == 0) {
                            cury += cur;
                        } else {
                            cury -= cur;
                        }

                    }

                } else {// change in x-direction,y constant
                    if (yObs.containsKey(cury)) {
                        if (curdir == 1) {
                            int n = lowerboung(curx, yObs.get(cury));
                            if (n == -1) {
                                curx += cur;
                            } else {
                                int tem = yObs.get(cury).get(n);
                                if (tem > curx + cur) {
                                    curx += cur;
                                } else {
                                    curx = tem - 1;
                                }
                            }

                        } else {
                            int n = highboung(curx, yObs.get(cury));
                            if (n == -1) {
                                curx -= cur;
                            } else {
                                int tem = yObs.get(cury).get(n);
                                if (tem < curx - cur) {
                                    curx -= cur;
                                } else {
                                    curx = tem + 1;
                                }
                            }
                        }

                    } else {
                        if (curdir == 1) {
                            curx += cur;
                        } else {
                            curx -= cur;
                        }
                    }
                }

            }
   max = Math.max(max, curx * curx + cury * cury);
        }
        return max;
    }
}