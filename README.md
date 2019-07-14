# RGB-Bar-Code-Generator-Extractor
Project overview:    Bar code is one of the most used encoding technique for string and other data. Hence RGB (red, green and blue) are the main three pigment of visual color, so that bar code can be implemented with these RGB colors.

Working procedure:   any string is the combination of characters which can be denoted by unique ASCII/Unicode value in an integer. This ASSCI value can be represented in the 8-bit binary value.  After that 8-bit binary, the combination  0 and 1 can be divided into 4 contiguous segments where every segment will be a combination of two binary digits.  There is 4 combinations of two binary digit such as 00, 01, 10 and 11. If we encode this combination for defining color such as  00 for no color,  01 for red, 10 for green and 11 for blue then every character can represent 4 segmented in a combination of RGB color. The concatenated RGB representation of characters of the following string can be derived as a generated bar code. 
    In the decoder, the exact same but the reverse algorithm will be applied to extract the bar code into a string.

Feature: 
--The generated bar code can be saved as an image file with an extension like png or bmp.
--The software can detect previously generated bar code and can extract the bar into a general string.
--In addition, the dissolved or damaged image also can be detected too.
--For use in the future, every generated bar code information can be stored in a database.
--The detection system will be implemented with a little bit of image processing approach.
