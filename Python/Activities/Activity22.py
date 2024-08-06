import pytest

def test_sum():
    assert 3 + 2 == 5, "Sum of 3 and 2 should be 5"

def test_difference():
    assert 3 - 2 == 1, "Difference of 3 and 2 should be 1"

@pytest.mark.activity
def test_product():
    assert 3 * 2 == 6, "Product of 3 and 2 should be 6"

@pytest.mark.activity
def test_quotient():
    assert 6 / 2 == 3, "Quotient of 6 and 2 should be 3"

if __name__ == "__main__":
    pytest.main()
