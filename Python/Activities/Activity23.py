import pytest

class TestSumList:
    
    @pytest.fixture
    def number_list(self):
        """Fixture that provides a list of numbers from 0 to 10."""
        return list(range(11))

    def test_sum_of_list(self, number_list):
        """Test that checks if the sum of the list is 55."""
        assert sum(number_list) == 55, "The sum of the list should be 55"

if __name__ == "__main__":
    pytest.main()
