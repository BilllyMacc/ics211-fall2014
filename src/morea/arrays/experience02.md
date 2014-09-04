---
title: "Assignment on Arrays - Part I (asmt #2)"
published: true
morea_id: experience02
morea_type: experience
morea_summary: "Write a program to create, initialize, and print out an array"
morea_sort_order: 2
---

## Instructions

Write a Java application that does the following.

1. Instantiate an array of 200 integers.
2. Use a 'for' or 'while' loop to initialize the array with the numbers. The numbers should start at 5, increase by 5, and negate all even numbers. For example: 5, -10, 15, -20, 25, ...
3. You need to use modulus to alternate the negative and positive numbers, and an "if-statement(s)". For an example of modulus operator, see the ArraysLoopsModulus.java example program.
4. Use another 'for' or 'while' loop to print out the array, displaying the index and the element on each line.
5. You should have two (2) loops in your program. The first loop initializes the array. The second loop outputs the array. The purpose of this assignment is to practice using arrays and loops.
6. Write your original comments every 3-5 lines of code.
7. Make sure your code follows the ICS 211 Java Coding Standard, in particular the Java documentation (Javadoc) comments that go above each method.

## Output

The output of your program should be as follows:

{% highlight java %}
index = 0, element = 5
index = 1, element = -10
index = 2, element = 15
index = 3, element = -20
index = 4, element = 25
index = 5, element = -30
index = 6, element = 35
index = 7, element = -40
index = 8, element = 45
index = 9, element = -50
index = 10, element = 55
index = 11, element = -60
index = 12, element = 65
index = 13, element = -70
index = 14, element = 75
index = 15, element = -80
index = 16, element = 85
index = 17, element = -90
index = 18, element = 95
index = 19, element = -100
index = 20, element = 105
index = 21, element = -110
index = 22, element = 115
index = 23, element = -120
index = 24, element = 125
index = 25, element = -130
index = 26, element = 135
index = 27, element = -140
index = 28, element = 145
index = 29, element = -150
index = 30, element = 155
index = 31, element = -160
index = 32, element = 165
index = 33, element = -170
index = 34, element = 175
index = 35, element = -180
index = 36, element = 185
index = 37, element = -190
index = 38, element = 195
index = 39, element = -200
index = 40, element = 205
index = 41, element = -210
index = 42, element = 215
index = 43, element = -220
index = 44, element = 225
index = 45, element = -230
index = 46, element = 235
index = 47, element = -240
index = 48, element = 245
index = 49, element = -250
index = 50, element = 255
index = 51, element = -260
index = 52, element = 265
index = 53, element = -270
index = 54, element = 275
index = 55, element = -280
index = 56, element = 285
index = 57, element = -290
index = 58, element = 295
index = 59, element = -300
index = 60, element = 305
index = 61, element = -310
index = 62, element = 315
index = 63, element = -320
index = 64, element = 325
index = 65, element = -330
index = 66, element = 335
index = 67, element = -340
index = 68, element = 345
index = 69, element = -350
index = 70, element = 355
index = 71, element = -360
index = 72, element = 365
index = 73, element = -370
index = 74, element = 375
index = 75, element = -380
index = 76, element = 385
index = 77, element = -390
index = 78, element = 395
index = 79, element = -400
index = 80, element = 405
index = 81, element = -410
index = 82, element = 415
index = 83, element = -420
index = 84, element = 425
index = 85, element = -430
index = 86, element = 435
index = 87, element = -440
index = 88, element = 445
index = 89, element = -450
index = 90, element = 455
index = 91, element = -460
index = 92, element = 465
index = 93, element = -470
index = 94, element = 475
index = 95, element = -480
index = 96, element = 485
index = 97, element = -490
index = 98, element = 495
index = 99, element = -500
index = 100, element = 505
index = 101, element = -510
index = 102, element = 515
index = 103, element = -520
index = 104, element = 525
index = 105, element = -530
index = 106, element = 535
index = 107, element = -540
index = 108, element = 545
index = 109, element = -550
index = 110, element = 555
index = 111, element = -560
index = 112, element = 565
index = 113, element = -570
index = 114, element = 575
index = 115, element = -580
index = 116, element = 585
index = 117, element = -590
index = 118, element = 595
index = 119, element = -600
index = 120, element = 605
index = 121, element = -610
index = 122, element = 615
index = 123, element = -620
index = 124, element = 625
index = 125, element = -630
index = 126, element = 635
index = 127, element = -640
index = 128, element = 645
index = 129, element = -650
index = 130, element = 655
index = 131, element = -660
index = 132, element = 665
index = 133, element = -670
index = 134, element = 675
index = 135, element = -680
index = 136, element = 685
index = 137, element = -690
index = 138, element = 695
index = 139, element = -700
index = 140, element = 705
index = 141, element = -710
index = 142, element = 715
index = 143, element = -720
index = 144, element = 725
index = 145, element = -730
index = 146, element = 735
index = 147, element = -740
index = 148, element = 745
index = 149, element = -750
index = 150, element = 755
index = 151, element = -760
index = 152, element = 765
index = 153, element = -770
index = 154, element = 775
index = 155, element = -780
index = 156, element = 785
index = 157, element = -790
index = 158, element = 795
index = 159, element = -800
index = 160, element = 805
index = 161, element = -810
index = 162, element = 815
index = 163, element = -820
index = 164, element = 825
index = 165, element = -830
index = 166, element = 835
index = 167, element = -840
index = 168, element = 845
index = 169, element = -850
index = 170, element = 855
index = 171, element = -860
index = 172, element = 865
index = 173, element = -870
index = 174, element = 875
index = 175, element = -880
index = 176, element = 885
index = 177, element = -890
index = 178, element = 895
index = 179, element = -900
index = 180, element = 905
index = 181, element = -910
index = 182, element = 915
index = 183, element = -920
index = 184, element = 925
index = 185, element = -930
index = 186, element = 935
index = 187, element = -940
index = 188, element = 945
index = 189, element = -950
index = 190, element = 955
index = 191, element = -960
index = 192, element = 965
index = 193, element = -970
index = 194, element = 975
index = 195, element = -980
index = 196, element = 985
index = 197, element = -990
index = 198, element = 995
index = 199, element = -1000
{% endhighlight %}