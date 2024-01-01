# Huffman Coding Implementation in Scala
## Introduction
This project presents an implementation of Huffman coding, a popular algorithm used for lossless data compression, written in Scala. It showcases an efficient way to encode and decode text files, demonstrating the power of this algorithm.

## Features
Binary Tree Representation for Huffman Coding: Implements Huffman coding using a binary tree, where each Leaf node symbolizes a character and its frequency of occurrence. This approach efficiently encodes and decodes data by leveraging the varying frequencies of characters.
CodeTree Structure: Defines an abstract class CodeTree with two case classes, Leaf and Fork. The Leaf class represents the actual characters and their frequencies, while the Fork class represents internal nodes of the tree, combining two subtrees.
Character Frequency Calculation: Contains functionality to compute the frequency of each character in the input data. This frequency calculation is a critical step in building the Huffman tree, as it determines the structure of the tree.
Huffman Tree Construction: Includes methods to construct the Huffman tree. The tree is built based on the frequency of characters, with common characters placed closer to the root for efficient encoding.
Encoding and Decoding Functions: Provides core functions to encode a given text into Huffman coded binary and to decode a Huffman encoded binary back into the original text. These functions showcase the practical application of the Huffman tree in data compression.
Utility Functions: Contains various utility functions such as weight, which calculates the total weight (frequency) of the tree, and chars, which extracts a list of characters represented in a CodeTree.
Efficient Data Compression: Demonstrates efficient data compression and decompression, making it suitable for applications where data size reduction is crucial.

## Installation and Setup
To set up this project:

Clone the repository:
    git clone https://github.com/Emre-Akgul/Huffman-Encoding
    
Navigate to the project directory:
    cd [Project directory]
    
Compile the Scala files (ensure Scala is installed):
    scalac *.scala

## Usage
Run the main application:

## Contact Information
For any additional questions or collaboration opportunities, feel free to contact me at emreakgulcs@gmail.com or visit my GitHub Profile.

